
inherit dnf-bridge

PN = "mecab-ipadic"
PE = "0"
PV = "2.7.0.20070801"
PR = "32.el10"
PACKAGES = "mecab-ipadic mecab-ipadic-EUCJP"


URI_mecab-ipadic = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mecab-ipadic-2.7.0.20070801-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab-ipadic = " \
 bash \
 mecab \
"

URI_mecab-ipadic-EUCJP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mecab-ipadic-EUCJP-2.7.0.20070801-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mecab-ipadic-EUCJP = " \
 bash \
 mecab \
"
