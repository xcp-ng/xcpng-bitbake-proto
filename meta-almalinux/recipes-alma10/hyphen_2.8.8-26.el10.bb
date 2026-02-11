
PN = "hyphen"
PE = "0"
PV = "2.8.8"
PR = "26.el10"
PACKAGES = "hyphen hyphen-devel hyphen-en"


URI_hyphen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-2.8.8-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hyphen = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:hyphen = "libhyphen.so.0()(64bit) ( ) hyphen ( =  2.8.8-26.el10) hyphen(x86-64) ( =  2.8.8-26.el10)"

URI_hyphen-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-devel-2.8.8-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hyphen-devel = "/usr/bin/perl ( ) libhyphen.so.0()(64bit) ( ) hyphen ( =  2.8.8-26.el10)"
RPROVIDES:hyphen-devel = "hyphen-devel ( =  2.8.8-26.el10) hyphen-devel(x86-64) ( =  2.8.8-26.el10)"

URI_hyphen-en = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-en-2.8.8-26.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-en = "hyphen ( )"
RPROVIDES:hyphen-en = "hyphen-en ( =  2.8.8-26.el10)"
