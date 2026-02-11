
PN = "pcaudiolib"
PE = "0"
PV = "1.1"
PR = "20.el10"
PACKAGES = "pcaudiolib pcaudiolib-devel"


URI_pcaudiolib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcaudiolib-1.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcaudiolib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libpulse.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( )"
RPROVIDES:pcaudiolib = "libpcaudio.so.0()(64bit) ( ) pcaudiolib ( =  1.1-20.el10) pcaudiolib(x86-64) ( =  1.1-20.el10)"

URI_pcaudiolib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pcaudiolib-devel-1.1-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcaudiolib-devel = "libpcaudio.so.0()(64bit) ( ) pcaudiolib(x86-64) ( =  1.1-20.el10)"
RPROVIDES:pcaudiolib-devel = "pcaudiolib-devel ( =  1.1-20.el10) pcaudiolib-devel(x86-64) ( =  1.1-20.el10)"
