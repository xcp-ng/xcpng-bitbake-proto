
PN = "gobject-introspection"
PE = "0"
PV = "1.79.1"
PR = "6.el10"
PACKAGES = "gobject-introspection gobject-introspection-devel"


URI_gobject-introspection = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gobject-introspection-1.79.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gobject-introspection = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) glib2(x86-64) ( >=  2.79.0)"
RPROVIDES:gobject-introspection = "libgirepository-1.0.so.1()(64bit) ( ) gobject-introspection ( =  1.79.1-6.el10) gobject-introspection(x86-64) ( =  1.79.1-6.el10)"

URI_gobject-introspection-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gobject-introspection-devel-1.79.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gobject-introspection-devel = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libtool ( ) libgirepository-1.0.so.1()(64bit) ( ) python3-mako ( ) pkgconfig(gobject-introspection-1.0) ( ) python3-markdown ( ) python(abi) ( if  python3) gobject-introspection(x86-64) ( =  1.79.1-6.el10) python3-setuptools ( if  (REL)) pkgconfig(glib-2.0) ( >=  2.79.0) pkgconfig(gobject-2.0) ( >=  2.79.0)"
RPROVIDES:gobject-introspection-devel = "gobject-introspection-devel ( =  1.79.1-6.el10) gobject-introspection-devel(x86-64) ( =  1.79.1-6.el10) pkgconfig(gobject-introspection-1.0) ( =  1.79.1) pkgconfig(gobject-introspection-no-export-1.0) ( =  1.79.1)"
