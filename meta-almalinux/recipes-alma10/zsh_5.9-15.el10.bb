
inherit dnf-bridge

PN = "zsh"
PE = "0"
PV = "5.9"
PR = "15.el10"
PACKAGES = "zsh zsh-html"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/zsh-5.9-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_zsh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zsh-5.9-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zsh}"
RDEPENDS:zsh = " \
 grep \
 ncurses-libs \
 bash \
 pcre2 \
 glibc \
 coreutils \
"

URI_zsh-html = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/zsh-html-5.9-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_zsh-html}"
RDEPENDS:zsh-html = ""
