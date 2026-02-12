
inherit dnf-bridge

PN = "slf4j"
PE = "0"
PV = "1.7.32"
PR = "13.el10"
PACKAGES = "jcl-over-slf4j slf4j slf4j-jdk14 jul-to-slf4j log4j-over-slf4j slf4j-javadoc slf4j-jcl slf4j-manual slf4j-migrator slf4j-sources"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/slf4j-1.7.32-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jcl-over-slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jcl-over-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jcl-over-slf4j}"
RDEPENDS:jcl-over-slf4j = " \
 javapackages-filesystem \
 slf4j \
"

URI_slf4j = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j}"
RDEPENDS:slf4j = " \
 javapackages-filesystem \
"

URI_slf4j-jdk14 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slf4j-jdk14-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-jdk14}"
RDEPENDS:slf4j-jdk14 = " \
 javapackages-filesystem \
 slf4j \
"

URI_jul-to-slf4j = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jul-to-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jul-to-slf4j}"
RDEPENDS:jul-to-slf4j = " \
 javapackages-filesystem \
 slf4j \
"

URI_log4j-over-slf4j = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/log4j-over-slf4j-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_log4j-over-slf4j}"
RDEPENDS:log4j-over-slf4j = " \
 javapackages-filesystem \
 slf4j \
"

URI_slf4j-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-javadoc-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-javadoc}"
RDEPENDS:slf4j-javadoc = " \
 javapackages-filesystem \
"

URI_slf4j-jcl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-jcl-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-jcl}"
RDEPENDS:slf4j-jcl = " \
 javapackages-filesystem \
 apache-commons-logging \
 slf4j \
"

URI_slf4j-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-manual-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-manual}"
RDEPENDS:slf4j-manual = ""

URI_slf4j-migrator = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-migrator-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-migrator}"
RDEPENDS:slf4j-migrator = " \
 javapackages-filesystem \
"

URI_slf4j-sources = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/slf4j-sources-1.7.32-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_slf4j-sources}"
RDEPENDS:slf4j-sources = " \
 javapackages-filesystem \
 apache-commons-logging \
 slf4j \
"
