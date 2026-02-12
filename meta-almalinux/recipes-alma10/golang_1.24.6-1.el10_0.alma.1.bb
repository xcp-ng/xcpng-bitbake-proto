
inherit dnf-bridge

PN = "golang"
PE = "0"
PV = "1.24.6"
PR = "1.el10_0.alma.1"
PACKAGES = "go-toolset golang golang-bin golang-docs golang-misc golang-race golang-src golang-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/golang-1.24.6-1.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_go-toolset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-toolset-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_go-toolset}"
RDEPENDS:go-toolset = " \
 delve \
 golang \
"

URI_golang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_golang}"
RDEPENDS:golang = " \
 golang-race \
 openssl-devel \
 golang-src \
 golang-bin \
"

URI_golang-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-bin-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_golang-bin}"
RDEPENDS:golang-bin = " \
 bash \
 gcc \
 glibc \
 alternatives \
 golang \
"

URI_golang-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-docs-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-docs}"
RDEPENDS:golang-docs = " \
 golang \
"

URI_golang-misc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-misc-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-misc}"
RDEPENDS:golang-misc = " \
 golang \
"

URI_golang-race = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-race-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_golang-race}"
RDEPENDS:golang-race = " \
 golang \
"

URI_golang-src = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-src-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-src}"
RDEPENDS:golang-src = ""

URI_golang-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-tests-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_golang-tests}"
RDEPENDS:golang-tests = " \
 golang \
"
