
PN = "chan"
PE = "0"
PV = "0.0.4"
PR = "14.el10"
PACKAGES = "chan chan-devel"


URI_chan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/chan-0.0.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chan = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.17)(64bit) ( )"
RPROVIDES:chan = "libchan.so.0()(64bit) ( ) chan ( =  0.0.4-14.el10) chan(x86-64) ( =  0.0.4-14.el10)"

URI_chan-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/chan-devel-0.0.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chan-devel = "libchan.so.0()(64bit) ( ) chan(x86-64) ( =  0.0.4-14.el10)"
RPROVIDES:chan-devel = "chan-devel ( =  0.0.4-14.el10) chan-devel(x86-64) ( =  0.0.4-14.el10)"
