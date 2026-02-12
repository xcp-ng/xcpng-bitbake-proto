
inherit dnf-bridge

PN = "libsamplerate"
PE = "0"
PV = "0.2.2"
PR = "10.el10"
PACKAGES = "libsamplerate libsamplerate-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libsamplerate-0.2.2-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsamplerate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsamplerate-0.2.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsamplerate}"
RDEPENDS:libsamplerate = " \
 glibc \
"

URI_libsamplerate-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsamplerate-devel-0.2.2-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsamplerate-devel}"
RDEPENDS:libsamplerate-devel = " \
 libsamplerate \
 pkgconf-pkg-config \
"
