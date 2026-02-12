
inherit dnf-bridge

PN = "speech-dispatcher"
PE = "0"
PV = "0.11.5"
PR = "8.el10"
PACKAGES = "python3-speechd speech-dispatcher speech-dispatcher-doc speech-dispatcher-espeak-ng speech-dispatcher-libs speech-dispatcher-utils speech-dispatcher-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/speech-dispatcher-0.11.5-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-speechd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-speechd-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-speechd}"
RDEPENDS:python3-speechd = " \
 python3 \
"

URI_speech-dispatcher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher}"
RDEPENDS:speech-dispatcher = " \
 alsa-lib \
 systemd \
 libtool-ltdl \
 speech-dispatcher-espeak-ng \
 pulseaudio-libs \
 dotconf \
 bash \
 glib2 \
 glibc \
 libao \
 libsndfile \
"

URI_speech-dispatcher-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-doc-0.11.5-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher-doc}"
RDEPENDS:speech-dispatcher-doc = " \
 speech-dispatcher \
"

URI_speech-dispatcher-espeak-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-espeak-ng-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher-espeak-ng}"
RDEPENDS:speech-dispatcher-espeak-ng = " \
 libtool-ltdl \
 speech-dispatcher \
 espeak-ng \
 dotconf \
 glib2 \
 glibc \
"

URI_speech-dispatcher-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-libs-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher-libs}"
RDEPENDS:speech-dispatcher-libs = " \
 glibc \
 libgcc \
 libtool-ltdl \
 glib2 \
"

URI_speech-dispatcher-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speech-dispatcher-utils-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher-utils}"
RDEPENDS:speech-dispatcher-utils = " \
 python3 \
 python3-speechd \
 speech-dispatcher-libs \
 pulseaudio-utils \
 glibc \
"

URI_speech-dispatcher-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speech-dispatcher-devel-0.11.5-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_speech-dispatcher-devel}"
RDEPENDS:speech-dispatcher-devel = " \
 speech-dispatcher-libs \
 glib2-devel \
 pkgconf-pkg-config \
"
