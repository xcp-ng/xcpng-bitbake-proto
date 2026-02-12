
inherit dnf-bridge

PN = "maven-enforcer"
PE = "0"
PV = "3.4.1"
PR = "4.el10"
PACKAGES = "maven-enforcer maven-enforcer-api maven-enforcer-extension maven-enforcer-javadoc maven-enforcer-plugin maven-enforcer-rules"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-enforcer-3.4.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-enforcer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer}"
RDEPENDS:maven-enforcer = " \
 javapackages-filesystem \
 maven-parent \
"

URI_maven-enforcer-api = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-api-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer-api}"
RDEPENDS:maven-enforcer-api = " \
 javapackages-filesystem \
"

URI_maven-enforcer-extension = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-extension-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer-extension}"
RDEPENDS:maven-enforcer-extension = " \
 javapackages-filesystem \
"

URI_maven-enforcer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-javadoc-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer-javadoc}"
RDEPENDS:maven-enforcer-javadoc = " \
 javapackages-filesystem \
"

URI_maven-enforcer-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-plugin-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer-plugin}"
RDEPENDS:maven-enforcer-plugin = " \
 maven-enforcer-api \
 jakarta-annotations \
 javapackages-filesystem \
 maven-enforcer-rules \
"

URI_maven-enforcer-rules = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-enforcer-rules-3.4.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-enforcer-rules}"
RDEPENDS:maven-enforcer-rules = " \
 apache-commons-codec \
 apache-commons-io \
 plexus-utils \
 javapackages-filesystem \
 apache-commons-lang3 \
 maven-enforcer-api \
 maven-resolver \
"
