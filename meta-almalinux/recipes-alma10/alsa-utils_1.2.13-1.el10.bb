
inherit dnf-bridge

PN = "alsa-utils"
PE = "0"
PV = "1.2.13"
PR = "1.el10"
PACKAGES = "alsa-ucm-utils alsa-utils alsa-topology-utils alsa-utils-alsabat"


URI_alsa-ucm-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-ucm-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-ucm-utils = " \
 glibc \
 alsa-lib \
"

URI_alsa-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-utils = " \
 alsa-lib \
 systemd \
 libsamplerate \
 alsa-ucm \
 bash \
 ncurses-libs \
 glibc \
"

URI_alsa-topology-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-topology-utils-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-topology-utils = " \
 glibc \
 alsa-lib \
 alsa-topology \
"

URI_alsa-utils-alsabat = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-utils-alsabat-1.2.13-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-utils-alsabat = " \
 fftw-libs-single \
 alsa-lib \
 libgcc \
 bash \
 glibc \
"
