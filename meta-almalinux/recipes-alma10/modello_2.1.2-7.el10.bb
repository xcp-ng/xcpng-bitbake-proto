
inherit dnf-bridge

PN = "modello"
PE = "0"
PV = "2.1.2"
PR = "7.el10"
PACKAGES = "modello modello-javadoc"


URI_modello = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modello-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:modello = " \
 plexus-containers-component-annotations \
 jsoup \
 plexus-utils \
 javapackages-filesystem \
 javapackages-tools \
 sisu \
 velocity \
 plexus-build-api0 \
 bash \
 google-guice \
"

URI_modello-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/modello-javadoc-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:modello-javadoc = " \
 javapackages-filesystem \
"
