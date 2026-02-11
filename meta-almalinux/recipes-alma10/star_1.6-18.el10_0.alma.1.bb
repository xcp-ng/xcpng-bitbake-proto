
PN = "star"
PE = "0"
PV = "1.6"
PR = "18.el10_0.alma.1"
PACKAGES = "rmt scpio spax star"


URI_rmt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rmt-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rmt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:rmt = "config(rmt) ( =  2:1.6-18.el10_0.alma.1) rmt ( =  2:1.6-18.el10_0.alma.1) rmt(x86-64) ( =  2:1.6-18.el10_0.alma.1)"

URI_scpio = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/scpio-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:scpio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:scpio = "scpio ( =  1.6-18.el10_0.alma.1) scpio(x86-64) ( =  1.6-18.el10_0.alma.1)"

URI_spax = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/spax-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:spax = "/bin/sh ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:spax = "spax ( =  1.6-18.el10_0.alma.1) spax(x86-64) ( =  1.6-18.el10_0.alma.1)"

URI_star = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/star-1.6-18.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:star = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:star = "star ( =  1.6-18.el10_0.alma.1) star(x86-64) ( =  1.6-18.el10_0.alma.1)"
