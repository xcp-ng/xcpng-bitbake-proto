
PN = "jitterentropy"
PE = "0"
PV = "3.6.0"
PR = "2.el10"
PACKAGES = "jitterentropy jitterentropy-devel"


URI_jitterentropy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/jitterentropy-3.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jitterentropy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:jitterentropy = "libjitterentropy.so.3()(64bit) ( ) jitterentropy ( =  3.6.0-2.el10) jitterentropy(x86-64) ( =  3.6.0-2.el10)"

URI_jitterentropy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jitterentropy-devel-3.6.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jitterentropy-devel = "libjitterentropy.so.3()(64bit) ( ) jitterentropy(x86-64) ( =  3.6.0-2.el10)"
RPROVIDES:jitterentropy-devel = "jitterentropy-devel ( =  3.6.0-2.el10) jitterentropy-devel(x86-64) ( =  3.6.0-2.el10)"
