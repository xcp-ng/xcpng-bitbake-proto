
PN = "alsa-plugins"
PE = "0"
PV = "1.2.7.1"
PR = "13.el10"
PACKAGES = "alsa-plugins-arcamav alsa-plugins-maemo alsa-plugins-oss alsa-plugins-pulseaudio alsa-plugins-samplerate alsa-plugins-speex alsa-plugins-upmix alsa-plugins-usbstream alsa-plugins-vdownmix"


URI_alsa-plugins-arcamav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-arcamav-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-arcamav = "
 glibc
 alsa-lib
"

URI_alsa-plugins-maemo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-maemo-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-maemo = "
 glibc
 alsa-lib
 dbus-libs
"

URI_alsa-plugins-oss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-oss-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-oss = "
 glibc
 alsa-lib
"

URI_alsa-plugins-pulseaudio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-pulseaudio-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-pulseaudio = "
 glibc
 pulseaudio-libs
 alsa-lib
"

URI_alsa-plugins-samplerate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-samplerate-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-samplerate = "
 glibc
 alsa-lib
 libsamplerate
"

URI_alsa-plugins-speex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-speex-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-speex = "
 glibc
 speex
 alsa-lib
 speexdsp
"

URI_alsa-plugins-upmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-upmix-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-upmix = "
 glibc
 alsa-lib
"

URI_alsa-plugins-usbstream = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-usbstream-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-usbstream = "
 glibc
 alsa-lib
"

URI_alsa-plugins-vdownmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-vdownmix-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-vdownmix = "
 glibc
 alsa-lib
"
