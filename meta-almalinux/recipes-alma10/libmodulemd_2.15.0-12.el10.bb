
PN = "libmodulemd"
PE = "0"
PV = "2.15.0"
PR = "12.el10"
PACKAGES = "libmodulemd python3-libmodulemd libmodulemd-devel"


URI_libmodulemd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libmodulemd-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmodulemd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) librpmio.so.10()(64bit) ( ) libyaml-0.so.2()(64bit) ( )"
RPROVIDES:libmodulemd = "libmodulemd.so.2()(64bit) ( ) libmodulemd ( =  2.15.0-12.el10) libmodulemd(x86-64) ( =  2.15.0-12.el10)"

URI_python3-libmodulemd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libmodulemd-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libmodulemd = "python3-gobject-base ( ) python3dist(six) ( ) python(abi) ( =  3.12) libmodulemd(x86-64) ( =  2.15.0-12.el10)"
RPROVIDES:python3-libmodulemd = "python-libmodulemd ( =  2.15.0-12.el10) python3-libmodulemd ( =  2.15.0-12.el10) python3-libmodulemd(x86-64) ( =  2.15.0-12.el10) python3.12-libmodulemd ( =  2.15.0-12.el10)"

URI_libmodulemd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmodulemd-devel-2.15.0-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmodulemd-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(rpm) ( ) pkgconfig(yaml-0.1) ( ) libmodulemd.so.2()(64bit) ( ) libmodulemd(x86-64) ( =  2.15.0-12.el10)"
RPROVIDES:libmodulemd-devel = "libmodulemd-devel ( =  2.15.0-12.el10) libmodulemd-devel(x86-64) ( =  2.15.0-12.el10) pkgconfig(modulemd-2.0) ( =  2.15.0)"
