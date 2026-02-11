
PN = "jq"
PE = "0"
PV = "1.7.1"
PR = "8.el10_0.1"
PACKAGES = "jq jq-devel"


URI_jq = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jq-1.7.1-8.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:jq = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libm.so.6(GLIBC_2.39)(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( ) libonig.so.5()(64bit) ( )"
RPROVIDES:jq = "libjq.so.1()(64bit) ( ) jq ( =  1.7.1-8.el10_0.1) jq(x86-64) ( =  1.7.1-8.el10_0.1)"

URI_jq-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jq-devel-1.7.1-8.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:jq-devel = "/usr/bin/pkg-config ( ) libjq.so.1()(64bit) ( ) jq(x86-64) ( =  1.7.1-8.el10_0.1)"
RPROVIDES:jq-devel = "pkgconfig(libjq) ( ) jq-devel ( =  1.7.1-8.el10_0.1) jq-devel(x86-64) ( =  1.7.1-8.el10_0.1)"
