
PN = "dotconf"
PE = "0"
PV = "1.3"
PR = "37.el10"
PACKAGES = "dotconf dotconf-devel"


URI_dotconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotconf-1.3-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotconf = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:dotconf = "libdotconf.so.0()(64bit) ( ) dotconf ( =  1.3-37.el10) dotconf(x86-64) ( =  1.3-37.el10)"

URI_dotconf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dotconf-devel-1.3-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dotconf-devel = "/usr/bin/pkg-config ( ) pkgconf-pkg-config ( ) libdotconf.so.0()(64bit) ( ) dotconf(x86-64) ( =  1.3-37.el10)"
RPROVIDES:dotconf-devel = "dotconf-devel ( =  1.3-37.el10) dotconf-devel(x86-64) ( =  1.3-37.el10) pkgconfig(dotconf) ( =  1.3)"
