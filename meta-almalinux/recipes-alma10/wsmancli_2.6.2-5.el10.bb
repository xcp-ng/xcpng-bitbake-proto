
PN = "wsmancli"
PE = "0"
PV = "2.6.2"
PR = "5.el10"
PACKAGES = "wsmancli"


URI_wsmancli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wsmancli-2.6.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wsmancli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) curl ( ) openwsman ( ) libwsman.so.1()(64bit) ( ) libwsman_client.so.5()(64bit) ( ) libwsman_curl_client_transport.so.1()(64bit) ( )"
RPROVIDES:wsmancli = "wsmancli ( =  2.6.2-5.el10) wsmancli(x86-64) ( =  2.6.2-5.el10)"
