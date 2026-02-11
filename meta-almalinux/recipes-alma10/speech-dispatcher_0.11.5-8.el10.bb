
PN = "speech-dispatcher"
PE = "0"
PV = "0.11.5"
PR = "8.el10"
PACKAGES = "python3-speechd speech-dispatcher speech-dispatcher-doc speech-dispatcher-espeak-ng speech-dispatcher-libs speech-dispatcher-utils speech-dispatcher-devel"


URI_python3-speechd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-speechd-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-speechd = "python(abi) ( =  3.12)"
RPROVIDES:python3-speechd = "python3-speechd ( =  0.11.5-8.el10) python-speechd ( =  0.11.5-8.el10) python3-speechd(x86-64) ( =  0.11.5-8.el10) python3.12-speechd ( =  0.11.5-8.el10)"

URI_speech-dispatcher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speech-dispatcher = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libpulse.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libltdl.so.7()(64bit) ( ) libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( ) libdotconf.so.0()(64bit) ( ) libao.so.4()(64bit) ( ) libao.so.4(LIBAO4_1.1.0)(64bit) ( ) speech-dispatcher-espeak-ng(x86-64) ( =  0.11.5-8.el10)"
RPROVIDES:speech-dispatcher = "speech-dispatcher ( =  0.11.5-8.el10) speech-dispatcher(x86-64) ( =  0.11.5-8.el10) config(speech-dispatcher) ( =  0.11.5-8.el10)"

URI_speech-dispatcher-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-doc-0.11.5-8.el10.noarch.rpm;unpack=0"
RDEPENDS:speech-dispatcher-doc = "speech-dispatcher ( =  0.11.5-8.el10)"
RPROVIDES:speech-dispatcher-doc = "speech-dispatcher-doc ( =  0.11.5-8.el10)"

URI_speech-dispatcher-espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-espeak-ng-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speech-dispatcher-espeak-ng = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libltdl.so.7()(64bit) ( ) libdotconf.so.0()(64bit) ( ) libespeak-ng.so.1()(64bit) ( ) speech-dispatcher(x86-64) ( =  0.11.5-8.el10)"
RPROVIDES:speech-dispatcher-espeak-ng = "speech-dispatcher-espeak-ng(x86-64) ( =  0.11.5-8.el10) config(speech-dispatcher-espeak-ng) ( =  0.11.5-8.el10) speech-dispatcher-espeak-ng ( =  0.11.5-8.el10)"

URI_speech-dispatcher-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-libs-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speech-dispatcher-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libltdl.so.7()(64bit) ( )"
RPROVIDES:speech-dispatcher-libs = "libspeechd.so.2()(64bit) ( ) speech-dispatcher-libs(x86-64) ( =  0.11.5-8.el10) speech-dispatcher-libs ( =  0.11.5-8.el10)"

URI_speech-dispatcher-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-utils-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speech-dispatcher-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) pulseaudio-utils ( ) libspeechd.so.2()(64bit) ( ) python3-speechd ( =  0.11.5-8.el10) speech-dispatcher-libs(x86-64) ( =  0.11.5-8.el10)"
RPROVIDES:speech-dispatcher-utils = "speech-dispatcher-utils ( =  0.11.5-8.el10) speech-dispatcher-utils(x86-64) ( =  0.11.5-8.el10)"

URI_speech-dispatcher-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speech-dispatcher-devel-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speech-dispatcher-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libspeechd.so.2()(64bit) ( ) speech-dispatcher-libs(x86-64) ( =  0.11.5-8.el10)"
RPROVIDES:speech-dispatcher-devel = "pkgconfig(speech-dispatcher) ( =  0.11.5) speech-dispatcher-devel ( =  0.11.5-8.el10) speech-dispatcher-devel(x86-64) ( =  0.11.5-8.el10)"
