package TopCoder;

public class SandwichBar {

	public static void main(String[] args) {
		String[]available = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "q", "oops", "o", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[]orders = {"b a y o h e w n aa x l p s f d i c r q k v u g z m", "y q w r z d g m s b n v x e bb j t f a p h k c o u", "z f b n a cc d v k p h t e r l w u c j x y q s m g", "f g s z y k l u x p j a d n e h q m c i w t dd r o", "w i ee r d t z u a v y c h l n m j p q s f o e g k", "a k j d m g c x f t r v b u i l o s y h z w p e ff", "h t i w f p e o k u s m q l c r y gg x g j b z d v", "q k x a b i u d w l r v s y j f m p c g hh o t z e", "ii k o f u v e l g i q m a c j p d y b x r h z w n", "i j jj f b l o x q a h k z v y t c w r n g d p m s", "m q i b d p v r w s z o n l u h c kk j a k t e f g", "o s g t b n z m v ll k w f r c h d j q l i y e u p", "q d i l t a y c g w u z mm v j p k b f e r m x s n", "i d c y n z e s q x a r p v f k g t b j h nn u w l", "w p n oo f v d a t s g u h y b z o q e m k i c l j", "f a v c w e q s t x g o l r z u n b p k pp d h y m", "k t l z m i f s b u w c p e y o h a r g d v j x qq", "h z l m k c r rr n i w t q g a b x v d p u s y e f", "a j ss f m k v d c y g i u h r t w n x o z e q p b", "g x d j l m tt u h e k o t w a q i p v b f r n c z", "f za t x y n h e b u c a i w v j r l k p m o q g s", "o i h k vv e d g s u x b f m t z y q l p w a c j v", "m z e a v h j l x w k g r i f y d q n p ww c s u o", "v xx u e c h a w t y n f l p q b x s k i r z g d m", "f g k u v q i b a o w l y x h z d m c e r t p n ja", "s w a h t j k q v c d f b o n zz e i p m r u g l x", "b w h f d e i aa j a s y p n o v z m u c x r k q l", "p b n k y g d f z q m i x t o a j w s u r c bb l h", "v r cc l w p k s q m a g z e i b u o x t d h y j f", "r dd y m c q b n l v s t w k g j o h u z a f i e x", "q e ee u h i w f s x l o m y b v t r d c g a z n p", "w g m l o u t k y b n d s p j q f e z v i r x ff c", "l x b z f g s k n q o m j h v t i r gg e y a d c w", "r c a f g y u s n e p q t j l o m d hh k i h z w x", "k q y r l s c a e j i n z x d p f m v g t h w ii u", "jj u x i v g z l s e b r j k q a y m h n w c o d t", "kk h x j l r y n m w k p u s t v z d f o c a g q b", "d g n o ll y f t b j k u q z x c i w a h e l v s r", "t f g m a mm y v u o b r p w d n x s i c q l h j k", "nn r g b p k y x f d o j u h c i v t m l s a e z q", "p c i y e l f b oo d h u x s q t m r z n w j k g o", "q x pp z a r u m v n o h e y t d i g c p k b l w s", "qq w s l p j i c z e h k u a v f x y t n b r o g m", "k z o d t c h l y j b w v q n f g u i x rr r m e a", "p g b k v a z l q u w o s h t f i c r d x n m y ss", "d f o z q v t a h e tt w k g b p u s n y r x m i j", "p j uu b t c v e h i u l r f x s m a g y k o w d z", "y u e k p z a v j w f o h g vv b c n l q d m t r i", "v s g d y a r u j z o k w e l b q t m ww i h c n p", "q i w u h n l s x o z d a t y f b r j c v k e p xx"};
		int res = whichOrder(available, orders);
		System.out.println(res);
	}

	public static int whichOrder(String[] available, String[] orders) {
		int index = 0;
		for (int i = 0; i < orders.length; i++) {
			String s = orders[i];
			String[] ind = s.split(" "); 
			for (String string : ind) {
				for (int j = 0; j < available.length; j++) {
					if (string.equals(available[j])) {
						s = s.replaceFirst(string, "");
					}
				}
			}
//			s = s.trim();
			System.out.println(s);
			if (s.length()==0) {
				return i;
			}
		}
		return -1;
	}
}
