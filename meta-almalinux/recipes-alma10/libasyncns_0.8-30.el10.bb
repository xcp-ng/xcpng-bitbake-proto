
PN = "libasyncns"
PE = "0"
PV = "0.8"
PR = "30.el10"
PACKAGES = "libasyncns libasyncns-devel"


URI_libasyncns = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libasyncns-0.8-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasyncns = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libasyncns = "libasyncns.so.0()(64bit) ( ) libasyncns ( =  0.8-30.el10) libasyncns(x86-64) ( =  0.8-30.el10)"

URI_libasyncns-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libasyncns-devel-0.8-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libasyncns-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libasyncns.so.0()(64bit) ( ) libasyncns ( =  0.8-30.el10)"
RPROVIDES:libasyncns-devel = "libasyncns-devel ( =  0.8-30.el10) libasyncns-devel(x86-64) ( =  0.8-30.el10) pkgconfig(libasyncns) ( =  0.8)"
