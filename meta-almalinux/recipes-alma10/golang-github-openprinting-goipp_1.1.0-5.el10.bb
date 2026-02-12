
inherit dnf-bridge

PN = "golang-github-openprinting-goipp"
PE = "0"
PV = "1.1.0"
PR = "5.el10"
PACKAGES = "golang-github-openprinting-goipp-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/golang-github-openprinting-goipp-1.1.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_golang-github-openprinting-goipp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/golang-github-openprinting-goipp-devel-1.1.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-github-openprinting-goipp-devel}"
RDEPENDS:golang-github-openprinting-goipp-devel = " \
 go-filesystem \
"
