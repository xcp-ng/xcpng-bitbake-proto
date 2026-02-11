
inherit dnf-bridge

PN = "golang-gopkg-russross-blackfriday-2"
PE = "0"
PV = "2.1.0"
PR = "7.el10"
PACKAGES = "compat-golang-github-russross-blackfriday-2-devel golang-gopkg-russross-blackfriday-2-devel"


URI_compat-golang-github-russross-blackfriday-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/compat-golang-github-russross-blackfriday-2-devel-2.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:compat-golang-github-russross-blackfriday-2-devel = " \
 golang-gopkg-russross-blackfriday-2-devel \
 go-filesystem \
"

URI_golang-gopkg-russross-blackfriday-2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-gopkg-russross-blackfriday-2-devel-2.1.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:golang-gopkg-russross-blackfriday-2-devel = " \
 go-filesystem \
"
