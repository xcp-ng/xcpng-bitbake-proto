
inherit dnf-bridge

PN = "assertj-core"
PE = "0"
PV = "3.24.2"
PR = "9.el10"
PACKAGES = "assertj-core assertj-core-javadoc"


URI_assertj-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/assertj-core-3.24.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:assertj-core = " \
 javapackages-filesystem \
 byte-buddy \
"

URI_assertj-core-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/assertj-core-javadoc-3.24.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:assertj-core-javadoc = " \
 javapackages-filesystem \
"
