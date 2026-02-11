
PN = "iperf3"
PE = "0"
PV = "3.17.1"
PR = "4.el10"
PACKAGES = "iperf3 iperf3-devel"


URI_iperf3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iperf3-3.17.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iperf3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libsctp.so.1()(64bit) ( ) libsctp.so.1(VERS_1)(64bit) ( )"
RPROVIDES:iperf3 = "libiperf.so.0()(64bit) ( ) iperf3 ( =  3.17.1-4.el10) iperf3(x86-64) ( =  3.17.1-4.el10)"

URI_iperf3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iperf3-devel-3.17.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iperf3-devel = "libiperf.so.0()(64bit) ( ) iperf3(x86-64) ( =  3.17.1-4.el10)"
RPROVIDES:iperf3-devel = "iperf3-devel ( =  3.17.1-4.el10) iperf3-devel(x86-64) ( =  3.17.1-4.el10)"
