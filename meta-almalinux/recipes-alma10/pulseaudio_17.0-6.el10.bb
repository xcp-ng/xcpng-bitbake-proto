
inherit dnf-bridge

PN = "pulseaudio"
PE = "0"
PV = "17.0"
PR = "6.el10"
PACKAGES = "pulseaudio-libs pulseaudio-libs-devel pulseaudio-libs-glib2 pulseaudio-utils"


URI_pulseaudio-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs = " \
 libasyncns \
 systemd-libs \
 libxcb \
 glibc \
 dbus-libs \
 libsndfile \
"

URI_pulseaudio-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-devel-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs-devel = " \
 glib2-devel \
 pulseaudio-libs \
 pulseaudio-libs-devel \
 pulseaudio-libs-glib2 \
 pkgconf-pkg-config \
"

URI_pulseaudio-libs-glib2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-libs-glib2-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-libs-glib2 = " \
 glibc \
 pulseaudio-libs \
 glib2 \
"

URI_pulseaudio-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pulseaudio-utils-17.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pulseaudio-utils = " \
 pulseaudio-libs \
 libxcb \
 bash \
 glibc \
 libsndfile \
"
