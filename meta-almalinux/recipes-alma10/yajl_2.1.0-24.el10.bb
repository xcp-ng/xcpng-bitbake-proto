
PN = "yajl"
PE = "0"
PV = "2.1.0"
PR = "24.el10"
PACKAGES = "yajl yajl-devel"


URI_yajl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yajl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:yajl = "libyajl.so.2()(64bit) ( ) yajl ( =  2.1.0-24.el10) yajl(x86-64) ( =  2.1.0-24.el10)"

URI_yajl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/yajl-devel-2.1.0-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:yajl-devel = "/usr/bin/pkg-config ( ) libyajl.so.2()(64bit) ( ) yajl ( =  2.1.0-24.el10)"
RPROVIDES:yajl-devel = "pkgconfig(yajl) ( =  2.1.0) yajl-devel ( =  2.1.0-24.el10) yajl-devel(x86-64) ( =  2.1.0-24.el10)"
