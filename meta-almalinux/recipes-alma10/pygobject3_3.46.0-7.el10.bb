
PN = "pygobject3"
PE = "0"
PV = "3.46.0"
PR = "7.el10"
PACKAGES = "python3-gobject-base python3-gobject-base-noarch python3-gobject python3-gobject-devel"


URI_python3-gobject-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gobject-base-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject-base = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libgirepository-1.0.so.1()(64bit) ( ) python(abi) ( =  3.12) python3-gobject-base-noarch ( =  3.46.0-7.el10) gobject-introspection(x86-64) ( >=  1.64.0)"
RPROVIDES:python3-gobject-base = "python3-gobject-base ( =  3.46.0-7.el10) python-gobject-base ( =  3.46.0-7.el10) python3-gobject-base(x86-64) ( =  3.46.0-7.el10) python3.12-gobject-base ( =  3.46.0-7.el10) python3.12dist(pygobject) ( =  3.46) python3dist(pygobject) ( =  3.46)"

URI_python3-gobject-base-noarch = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-gobject-base-noarch-3.46.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-gobject-base-noarch = "python(abi) ( =  3.12) python3-gobject-base ( =  3.46.0-7.el10)"
RPROVIDES:python3-gobject-base-noarch = "python3-gobject-base-noarch ( =  3.46.0-7.el10) python-gobject-base-noarch ( =  3.46.0-7.el10) python3.12-gobject-base-noarch ( =  3.46.0-7.el10)"

URI_python3-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gobject-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject = "rtld(GNU_HASH) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) python(abi) ( =  3.12) python3-gobject-base(x86-64) ( =  3.46.0-7.el10) python3-cairo(x86-64) ( >=  1.16.0)"
RPROVIDES:python3-gobject = "python-gobject ( =  3.46.0-7.el10) python3-gobject ( =  3.46.0-7.el10) python3-gobject(x86-64) ( =  3.46.0-7.el10) python3.12-gobject ( =  3.46.0-7.el10)"

URI_python3-gobject-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-gobject-devel-3.46.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-gobject-devel = "/usr/bin/pkg-config ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(libffi) ( ) gobject-introspection-devel(x86-64) ( ) python3-gobject(x86-64) ( =  3.46.0-7.el10)"
RPROVIDES:python3-gobject-devel = "pkgconfig(pygobject-3.0) ( =  3.46.0) pygobject3-devel ( =  3.46.0-7.el10) python-gobject-devel ( =  3.46.0-7.el10) python3-gobject-devel ( =  3.46.0-7.el10) python3-gobject-devel(x86-64) ( =  3.46.0-7.el10) python3.12-gobject-devel ( =  3.46.0-7.el10)"
