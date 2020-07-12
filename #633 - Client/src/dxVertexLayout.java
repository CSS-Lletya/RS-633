/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends Class219 {
	IDirect3DVertexDeclaration anIDirect3DVertexDeclaration5334;

	dxVertexLayout(Class163_Sub2_Sub2 class163_sub2_sub2, Class315[] class315s) {
		try {
			VertexElementCollection vertexelementcollection = new VertexElementCollection(
					((Class163_Sub2_Sub2) class163_sub2_sub2).aClass185_9577);
			int i = 0;
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (class315s.length ^ 0xffffffff); i_0_++) {
				int i_1_ = 0;
				Class315 class315 = class315s[i_0_];
				for (int i_2_ = 0; i_2_ < class315.method1915((byte) 43); i_2_++) {
					Class27 class27 = class315.method1914(93, i_2_);
					if (Class27.aClass27_345 != class27) {
						if (class27 != Class27.aClass27_351) {
							if (class27 != Class27.aClass27_352) {
								if (Class27.aClass27_353 == class27)
									vertexelementcollection.addElement(i_0_, 0,
											0, 5, i++, i_1_);
								else if (class27 != Class27.aClass27_354) {
									if (class27 == Class27.aClass27_355)
										vertexelementcollection.addElement(
												i_0_, 2, 0, 5, i++, i_1_);
									else if (Class27.aClass27_356 == class27)
										vertexelementcollection.addElement(
												i_0_, 3, 0, 5, i++, i_1_);
								} else
									vertexelementcollection.addElement(i_0_, 1,
											0, 5, i++, i_1_);
							} else
								vertexelementcollection.addElement(i_0_, 4, 0,
										10, 0, i_1_);
						} else
							vertexelementcollection.addElement(i_0_, 2, 0, 3,
									0, i_1_);
					} else
						vertexelementcollection.addElement(i_0_, 2, 0, 0, 0,
								i_1_);
					i_1_ += ((Class27) class27).anInt349;
				}
			}
			vertexelementcollection.finish();
			((dxVertexLayout) this).anIDirect3DVertexDeclaration5334 = ((Class163_Sub2_Sub2) class163_sub2_sub2).anIDirect3DDevice9578
					.method3373(vertexelementcollection, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
