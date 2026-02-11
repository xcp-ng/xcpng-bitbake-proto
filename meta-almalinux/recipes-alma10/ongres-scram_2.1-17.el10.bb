
inherit dnf-bridge

PN = "ongres-scram"
PE = "0"
PV = "2.1"
PR = "17.el10"
PACKAGES = "ongres-scram ongres-scram-client ongres-scram-javadoc ongres-scram-parent"


URI_ongres-scram = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ongres-scram-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram = " \
 ongres-stringprep \
 javapackages-filesystem \
"

URI_ongres-scram-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ongres-scram-client-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-client = " \
 javapackages-filesystem \
 ongres-scram \
"

URI_ongres-scram-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ongres-scram-javadoc-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-javadoc = " \
 javapackages-filesystem \
"

URI_ongres-scram-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ongres-scram-parent-2.1-17.el10.noarch.rpm;unpack=0"
RDEPENDS:ongres-scram-parent = " \
 maven-compiler-plugin \
 javapackages-filesystem \
"
