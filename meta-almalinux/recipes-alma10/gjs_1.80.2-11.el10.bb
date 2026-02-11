
PN = "gjs"
PE = "0"
PV = "1.80.2"
PR = "11.el10"
PACKAGES = "gjs gjs-devel gjs-tests"


URI_gjs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gjs-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) ld-linux-x86-64.so.2()(64bit) ( ) ld-linux-x86-64.so.2(GLIBC_2.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libgcc_s.so.1(GCC_4.2.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libicuuc.so.74()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libicui18n.so.74()(64bit) ( ) libgirepository-1.0.so.1()(64bit) ( ) glib2(x86-64) ( >=  2.66.0) gobject-introspection(x86-64) ( >=  1.66.0)"
RPROVIDES:gjs = "libgjs.so.0()(64bit) ( ) bundled(mozjs) ( =  115.15.0) gjs ( =  1.80.2-11.el10) gjs(x86-64) ( =  1.80.2-11.el10)"

URI_gjs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gjs-devel-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs-devel = "/usr/bin/pkg-config ( ) pkgconfig(cairo) ( ) pkgconfig(cairo-xlib) ( ) pkgconfig(libffi) ( ) libgjs.so.0()(64bit) ( ) pkgconfig(cairo-gobject) ( ) gjs(x86-64) ( =  1.80.2-11.el10) pkgconfig(gio-2.0) ( >=  2.66.0) pkgconfig(glib-2.0) ( >=  2.66.0) pkgconfig(gobject-2.0) ( >=  2.66.0) pkgconfig(gobject-introspection-1.0) ( >=  1.66.0) pkgconfig(gthread-2.0) ( >=  2.66.0)"
RPROVIDES:gjs-devel = "gjs-devel ( =  1.80.2-11.el10) gjs-devel(x86-64) ( =  1.80.2-11.el10) pkgconfig(gjs-1.0) ( =  1.80.2)"

URI_gjs-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gjs-tests-1.80.2-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gjs-tests = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libcairo.so.2()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libgirepository-1.0.so.1()(64bit) ( ) libgjs.so.0()(64bit) ( ) gjs(x86-64) ( =  1.80.2-11.el10)"
RPROVIDES:gjs-tests = "libgimarshallingtests.so()(64bit) ( ) libgjstesttools.so()(64bit) ( ) libregress.so()(64bit) ( ) libwarnlib.so()(64bit) ( ) gjs-tests ( =  1.80.2-11.el10) gjs-tests(x86-64) ( =  1.80.2-11.el10)"
