
PN = "libxkbfile"
PE = "0"
PV = "1.1.3"
PR = "3.el10"
PACKAGES = "libxkbfile libxkbfile-devel"


URI_libxkbfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxkbfile-1.1.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbfile = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( )"
RPROVIDES:libxkbfile = "libxkbfile.so.1()(64bit) ( ) libxkbfile ( =  1.1.3-3.el10) libxkbfile(x86-64) ( =  1.1.3-3.el10)"

URI_libxkbfile-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxkbfile-devel-1.1.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxkbfile-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libxkbfile.so.1()(64bit) ( ) pkgconfig(kbproto) ( ) libxkbfile ( =  1.1.3-3.el10)"
RPROVIDES:libxkbfile-devel = "libxkbfile-devel ( =  1.1.3-3.el10) libxkbfile-devel(x86-64) ( =  1.1.3-3.el10) pkgconfig(xkbfile) ( =  1.1.3)"
