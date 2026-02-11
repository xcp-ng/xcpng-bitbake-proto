
inherit dnf-bridge

PN = "mecab"
PE = "0"
PV = "0.996"
PR = "9.el10"
PACKAGES = "mecab mecab-devel"


URI_mecab = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mecab-0.996-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_mecab-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mecab-devel-0.996-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab-devel = " \
 bash \
 mecab \
"
