
PN = "alsa-tools"
PE = "0"
PV = "1.2.11"
PR = "5.el10"
PACKAGES = "alsa-tools-firmware"


URI_alsa-tools-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-tools-firmware-1.2.11-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-tools-firmware = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) udev ( ) alsa-firmware ( ) fxload ( )"
RPROVIDES:alsa-tools-firmware = "alsa-tools-firmware ( =  1.2.11-5.el10) alsa-tools-firmware(x86-64) ( =  1.2.11-5.el10)"
