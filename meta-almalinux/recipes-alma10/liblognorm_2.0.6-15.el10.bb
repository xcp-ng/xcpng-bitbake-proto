
PN = "liblognorm"
PE = "0"
PV = "2.0.6"
PR = "15.el10"
PACKAGES = "liblognorm liblognorm-doc liblognorm-devel liblognorm-utils"


URI_liblognorm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblognorm-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) libestr.so.0()(64bit) ( )"
RPROVIDES:liblognorm = "liblognorm.so.5()(64bit) ( ) liblognorm ( =  2.0.6-15.el10) liblognorm(x86-64) ( =  2.0.6-15.el10)"

URI_liblognorm-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblognorm-doc-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-doc = ""
RPROVIDES:liblognorm-doc = "liblognorm-doc ( =  2.0.6-15.el10) liblognorm-doc(x86-64) ( =  2.0.6-15.el10)"

URI_liblognorm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liblognorm-devel-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-devel = "/usr/bin/pkg-config ( ) json-c-devel(x86-64) ( ) libestr-devel(x86-64) ( ) pkgconfig(libfastjson) ( ) liblognorm.so.5()(64bit) ( ) liblognorm(x86-64) ( =  2.0.6-15.el10)"
RPROVIDES:liblognorm-devel = "liblognorm-devel ( =  2.0.6-15.el10) liblognorm-devel(x86-64) ( =  2.0.6-15.el10) pkgconfig(lognorm) ( =  2.0.6)"

URI_liblognorm-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblognorm-utils-2.0.6-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblognorm-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libestr.so.0()(64bit) ( ) libfastjson.so.4()(64bit) ( ) liblognorm.so.5()(64bit) ( ) liblognorm(x86-64) ( =  2.0.6-15.el10)"
RPROVIDES:liblognorm-utils = "liblognorm-utils ( =  2.0.6-15.el10) liblognorm-utils(x86-64) ( =  2.0.6-15.el10)"
