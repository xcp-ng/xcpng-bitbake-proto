
inherit dnf-bridge

PN = "plexus-compiler"
PE = "0"
PV = "2.14.2"
PR = "4.el10"
PACKAGES = "plexus-compiler plexus-compiler-extras plexus-compiler-javadoc plexus-compiler-pom"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/plexus-compiler-2.14.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_plexus-compiler = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-2.14.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-compiler}"
RDEPENDS:plexus-compiler = " \
 plexus-utils \
 atinject \
 javapackages-filesystem \
 slf4j \
"

URI_plexus-compiler-extras = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-extras-2.14.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-compiler-extras}"
RDEPENDS:plexus-compiler-extras = " \
 plexus-utils \
 atinject \
 javapackages-filesystem \
 plexus-compiler \
"

URI_plexus-compiler-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-javadoc-2.14.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-compiler-javadoc}"
RDEPENDS:plexus-compiler-javadoc = " \
 javapackages-filesystem \
"

URI_plexus-compiler-pom = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plexus-compiler-pom-2.14.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_plexus-compiler-pom}"
RDEPENDS:plexus-compiler-pom = " \
 plexus-pom \
 sisu-mojos \
 javapackages-filesystem \
 plexus-compiler \
"
