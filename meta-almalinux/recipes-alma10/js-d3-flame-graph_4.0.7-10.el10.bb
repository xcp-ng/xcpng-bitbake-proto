
inherit dnf-bridge

PN = "js-d3-flame-graph"
PE = "0"
PV = "4.0.7"
PR = "10.el10"
PACKAGES = "js-d3-flame-graph js-d3-flame-graph-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/js-d3-flame-graph-4.0.7-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_js-d3-flame-graph = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/js-d3-flame-graph-4.0.7-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_js-d3-flame-graph}"
RDEPENDS:js-d3-flame-graph = ""

URI_js-d3-flame-graph-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/js-d3-flame-graph-doc-4.0.7-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_js-d3-flame-graph-doc}"
RDEPENDS:js-d3-flame-graph-doc = ""
