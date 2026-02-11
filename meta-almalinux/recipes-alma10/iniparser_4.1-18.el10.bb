
PN = "iniparser"
PE = "0"
PV = "4.1"
PR = "18.el10"
PACKAGES = "iniparser iniparser-devel"


URI_iniparser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iniparser-4.1-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iniparser = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( )"
RPROVIDES:iniparser = "libiniparser.so.1()(64bit) ( ) iniparser ( =  4.1-18.el10) iniparser(x86-64) ( =  4.1-18.el10)"

URI_iniparser-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iniparser-devel-4.1-18.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iniparser-devel = "libiniparser.so.1()(64bit) ( ) iniparser ( =  4.1-18.el10)"
RPROVIDES:iniparser-devel = "iniparser-devel ( =  4.1-18.el10) iniparser-devel(x86-64) ( =  4.1-18.el10)"
