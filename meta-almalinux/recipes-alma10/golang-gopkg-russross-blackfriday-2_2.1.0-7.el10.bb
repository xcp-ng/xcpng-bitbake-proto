
inherit dnf-bridge

PN = "golang-gopkg-russross-blackfriday-2"
PE = "0"
PV = "2.1.0"
PR = "7.el10"
PACKAGES = "compat-golang-github-russross-blackfriday-2-devel golang-gopkg-russross-blackfriday-2-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/golang-gopkg-russross-blackfriday-2-2.1.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_compat-golang-github-russross-blackfriday-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/compat-golang-github-russross-blackfriday-2-devel-2.1.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_compat-golang-github-russross-blackfriday-2-devel}"
RDEPENDS:compat-golang-github-russross-blackfriday-2-devel = " \
 golang-gopkg-russross-blackfriday-2-devel \
 go-filesystem \
"

URI_golang-gopkg-russross-blackfriday-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-gopkg-russross-blackfriday-2-devel-2.1.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-gopkg-russross-blackfriday-2-devel}"
RDEPENDS:golang-gopkg-russross-blackfriday-2-devel = " \
 go-filesystem \
"
