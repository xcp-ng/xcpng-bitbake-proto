
PN = "flatpak-builder"
PE = "0"
PV = "1.4.4"
PR = "1.el10"
PACKAGES = "flatpak-builder flatpak-builder-tests"


URI_flatpak-builder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-builder-1.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-builder = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libyaml-0.so.2()(64bit) ( ) libostree-1.so.1()(64bit) ( ) libostree-1.so.1(LIBOSTREE_2016.3)(64bit) ( ) libostree-1.so.1(LIBOSTREE_2016.8)(64bit) ( ) libostree-1.so.1(LIBOSTREE_2018.6)(64bit) ( ) /usr/bin/rofiles-fuse ( ) appstream-compose ( >=  0.15.0) debugedit ( >=  5.0) flatpak(x86-64) ( >=  0.99.1) glib2(x86-64) ( >=  2.66) ostree-libs(x86-64) ( >=  2017.14)"
RPROVIDES:flatpak-builder = "flatpak-builder ( =  1.4.4-1.el10) flatpak-builder(x86-64) ( =  1.4.4-1.el10)"

URI_flatpak-builder-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flatpak-builder-tests-1.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-builder-tests = "/usr/bin/sh ( ) /usr/bin/bash ( ) flatpak-builder(x86-64) ( =  1.4.4-1.el10)"
RPROVIDES:flatpak-builder-tests = "flatpak-builder-tests ( =  1.4.4-1.el10) flatpak-builder-tests(x86-64) ( =  1.4.4-1.el10)"
