
PN = "glib2"
PE = "0"
PV = "2.80.4"
PR = "4.el10_0.7"
PACKAGES = "glib2 glib2-devel glib2-tests glib2-doc glib2-static"


URI_glib2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/glib2-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /bin/sh ( ) libm.so.6()(64bit) ( ) libselinux.so.1()(64bit) ( ) libz.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) libmount.so.1()(64bit) ( ) libmount.so.1(MOUNT_2.19)(64bit) ( ) libmount.so.1(MOUNT_2.20)(64bit) ( ) libmount.so.1(MOUNT_2.26)(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) libmount.so.1(MOUNT_2_40)(64bit) ( )"
RPROVIDES:glib2 = "libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) bundled(gnulib) ( ) libgmodule-2.0.so.0()(64bit) ( ) bundled(cmph) ( ) bundled(dirent) ( ) bundled(gvdb) ( ) bundled(libcharset) ( ) bundled(xdgmime) ( ) libgirepository-2.0.so.0()(64bit) ( ) libgthread-2.0.so.0()(64bit) ( ) glib2 ( =  2.80.4-4.el10_0.7) glib2(x86-64) ( =  2.80.4-4.el10_0.7)"

URI_glib2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glib2-devel-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libgmodule-2.0.so.0()(64bit) ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gobject-2.0) ( ) libgthread-2.0.so.0()(64bit) ( ) python3-packaging ( ) pkgconfig(gmodule-no-export-2.0) ( ) libgirepository-2.0.so.0()(64bit) ( ) pkgconfig(libffi) ( >=  3.0.0) pkgconfig(libpcre2-8) ( >=  10.32) pkgconfig(libselinux) ( >=  2.2) pkgconfig(mount) ( >=  2.23) pkgconfig(sysprof-capture-4) ( >=  3.38.0) glib2(x86-64) ( =  2.80.4-4.el10_0.7)"
RPROVIDES:glib2-devel = "pkgconfig(gio-2.0) ( =  2.80.4) pkgconfig(gio-unix-2.0) ( =  2.80.4) pkgconfig(girepository-2.0) ( =  2.80.4) pkgconfig(glib-2.0) ( =  2.80.4) pkgconfig(gmodule-2.0) ( =  2.80.4) pkgconfig(gmodule-export-2.0) ( =  2.80.4) pkgconfig(gmodule-no-export-2.0) ( =  2.80.4) pkgconfig(gobject-2.0) ( =  2.80.4) pkgconfig(gthread-2.0) ( =  2.80.4) glib2-devel ( =  2.80.4-4.el10_0.7) glib2-devel(x86-64) ( =  2.80.4-4.el10_0.7)"

URI_glib2-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glib2-tests-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libgthread-2.0.so.0()(64bit) ( ) libgirepository-2.0.so.0()(64bit) ( ) glib2(x86-64) ( =  2.80.4-4.el10_0.7)"
RPROVIDES:glib2-tests = "libgdbus-example-objectmanager.so()(64bit) ( ) libmoduletestplugin_a_library.so()(64bit) ( ) libmoduletestplugin_a_plugin.so()(64bit) ( ) libmoduletestplugin_b_library.so()(64bit) ( ) libmoduletestplugin_b_plugin.so()(64bit) ( ) libresourceplugin.so()(64bit) ( ) libtestmodulea.so()(64bit) ( ) libtestmoduleb.so()(64bit) ( ) glib2-tests ( =  2.80.4-4.el10_0.7) glib2-tests(x86-64) ( =  2.80.4-4.el10_0.7)"

URI_glib2-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glib2-doc-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-doc = "glib2(x86-64) ( =  2.80.4-4.el10_0.7)"
RPROVIDES:glib2-doc = "glib2-doc ( =  2.80.4-4.el10_0.7) glib2-doc(x86-64) ( =  2.80.4-4.el10_0.7)"

URI_glib2-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glib2-static-2.80.4-4.el10_0.7.x86_64_v2.rpm;unpack=0"
RDEPENDS:glib2-static = "pcre2-static ( ) sysprof-capture-static ( ) glib2-devel ( =  2.80.4-4.el10_0.7)"
RPROVIDES:glib2-static = "glib2-static ( =  2.80.4-4.el10_0.7) glib2-static(x86-64) ( =  2.80.4-4.el10_0.7)"
