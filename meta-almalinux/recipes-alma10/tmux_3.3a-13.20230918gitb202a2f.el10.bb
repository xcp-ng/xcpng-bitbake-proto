
inherit dnf-bridge

PN = "tmux"
PE = "0"
PV = "3.3a"
PR = "13.20230918gitb202a2f.el10"
PACKAGES = "tmux"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/tmux-3.3a-13.20230918gitb202a2f.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tmux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tmux-3.3a-13.20230918gitb202a2f.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tmux}"
RDEPENDS:tmux = " \
 systemd-libs \
 libevent \
 ncurses-libs \
 bash \
 glibc \
"
