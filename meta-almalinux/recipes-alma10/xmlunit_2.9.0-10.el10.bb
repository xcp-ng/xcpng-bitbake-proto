
inherit dnf-bridge

PN = "xmlunit"
PE = "0"
PV = "2.9.0"
PR = "10.el10"
PACKAGES = "xmlunit xmlunit-assertj xmlunit-core xmlunit-javadoc xmlunit-legacy xmlunit-matchers xmlunit-placeholders"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/xmlunit-2.9.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xmlunit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit}"
RDEPENDS:xmlunit = " \
 maven-bundle-plugin \
 javapackages-filesystem \
"

URI_xmlunit-assertj = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-assertj-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-assertj}"
RDEPENDS:xmlunit-assertj = " \
 xmlunit-core \
 assertj-core \
 javapackages-filesystem \
"

URI_xmlunit-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-core-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-core}"
RDEPENDS:xmlunit-core = " \
 javapackages-filesystem \
"

URI_xmlunit-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-javadoc-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-javadoc}"
RDEPENDS:xmlunit-javadoc = " \
 javapackages-filesystem \
"

URI_xmlunit-legacy = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-legacy-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-legacy}"
RDEPENDS:xmlunit-legacy = " \
 xmlunit-core \
 junit \
 javapackages-filesystem \
"

URI_xmlunit-matchers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-matchers-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-matchers}"
RDEPENDS:xmlunit-matchers = " \
 xmlunit-core \
 hamcrest \
 javapackages-filesystem \
"

URI_xmlunit-placeholders = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlunit-placeholders-2.9.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xmlunit-placeholders}"
RDEPENDS:xmlunit-placeholders = " \
 xmlunit-core \
 javapackages-filesystem \
"
