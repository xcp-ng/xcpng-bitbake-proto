
PN = "libxmlb"
PE = "0"
PV = "0.3.15"
PR = "7.el10"
PACKAGES = "libxmlb libxmlb-devel libxmlb-tests"


URI_libxmlb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libxmlb-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxmlb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) shared-mime-info ( ) glib2(x86-64) ( >=  2.45.8)"
RPROVIDES:libxmlb = "libxmlb.so.2()(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.0)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.1)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.11)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.12)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.15)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.2)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.3)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.4)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.5)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.6)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.7)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.2.0)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.0)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.13)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.1)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.4)(64bit) ( ) libxmlb ( =  0.3.15-7.el10) libxmlb(x86-64) ( =  0.3.15-7.el10)"

URI_libxmlb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxmlb-devel-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxmlb-devel = "/usr/bin/pkg-config ( ) pkgconfig(libzstd) ( ) pkgconfig(liblzma) ( ) libxmlb.so.2()(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.45.8) libxmlb(x86-64) ( =  0.3.15-7.el10)"
RPROVIDES:libxmlb-devel = "libxmlb-devel ( =  0.3.15-7.el10) libxmlb-devel(x86-64) ( =  0.3.15-7.el10) pkgconfig(xmlb) ( =  0.3.15)"

URI_libxmlb-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libxmlb-tests-0.3.15-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxmlb-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libzstd.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( )"
RPROVIDES:libxmlb-tests = "libxmlb-tests ( =  0.3.15-7.el10) libxmlb-tests(x86-64) ( =  0.3.15-7.el10)"
