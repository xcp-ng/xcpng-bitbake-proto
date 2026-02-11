
PN = "hostapd"
PE = "0"
PV = "2.11"
PR = "2.el10"
PACKAGES = "hostapd hostapd-logwatch"


URI_hostapd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hostapd-2.11-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hostapd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( ) libnl-3.so.200(libnl_3_2_27)(64bit) ( )"
RPROVIDES:hostapd = "config(hostapd) ( =  2.11-2.el10) hostapd ( =  2.11-2.el10) hostapd(x86-64) ( =  2.11-2.el10)"

URI_hostapd-logwatch = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hostapd-logwatch-2.11-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hostapd-logwatch = "perl(strict) ( ) /usr/bin/perl ( ) perl-interpreter ( ) logwatch ( ) hostapd ( =  2.11-2.el10)"
RPROVIDES:hostapd-logwatch = "config(hostapd-logwatch) ( =  2.11-2.el10) hostapd-logwatch ( =  2.11-2.el10) hostapd-logwatch(x86-64) ( =  2.11-2.el10)"
