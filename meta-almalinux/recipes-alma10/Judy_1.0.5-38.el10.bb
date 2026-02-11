
PN = "Judy"
PE = "0"
PV = "1.0.5"
PR = "38.el10"
PACKAGES = "Judy Judy-devel"


URI_Judy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/Judy-1.0.5-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Judy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:Judy = "libJudy.so.1()(64bit) ( ) Judy ( =  1.0.5-38.el10) Judy(x86-64) ( =  1.0.5-38.el10)"

URI_Judy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/Judy-devel-1.0.5-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Judy-devel = "libJudy.so.1()(64bit) ( ) Judy ( =  1.0.5-38.el10)"
RPROVIDES:Judy-devel = "Judy-devel ( =  1.0.5-38.el10) Judy-devel(x86-64) ( =  1.0.5-38.el10)"
