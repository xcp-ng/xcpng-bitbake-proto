
inherit dnf-bridge

PN = "mpg123"
PE = "0"
PV = "1.32.9"
PR = "1.el10"
PACKAGES = "mpg123 mpg123-libs mpg123-plugins-pulseaudio mpg123-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mpg123-1.32.9-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mpg123 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpg123}"
RDEPENDS:mpg123 = " \
 glibc \
 alsa-lib \
 mpg123-libs \
"

URI_mpg123-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-libs-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpg123-libs}"
RDEPENDS:mpg123-libs = " \
 glibc \
"

URI_mpg123-plugins-pulseaudio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpg123-plugins-pulseaudio-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpg123-plugins-pulseaudio}"
RDEPENDS:mpg123-plugins-pulseaudio = " \
 glibc \
 pulseaudio-libs \
 mpg123 \
"

URI_mpg123-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mpg123-devel-1.32.9-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mpg123-devel}"
RDEPENDS:mpg123-devel = " \
 mpg123-libs \
 pkgconf-pkg-config \
"
