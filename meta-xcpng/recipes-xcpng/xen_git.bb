inherit xcp-ng-rpm

SRCREV = "a7476efcb22d0df97f3ec9c5342c0e0fd4f62285"
SRCREV:aarch64 = "7c96929f152d85fda69088c8c876ad75d6a6cc39"

DEPENDS += "ocaml ocaml-findlib libempserver"
DEPENDS:append:x86-64-v2 = " dev86"

EXTRA_UPSTREAM_DEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/figlet-2.2.5-38.el10_1.alma_altarch.x86_64_v2.rpm \
"

EXTRA_UPSTREAM_DEPENDS:aarch64 = " \
${EPEL_MIRROR}/10.1/Everything/x86_64/Packages/f/figlet-2.2.5-38.el10_1.aarch64.rpm \
"

RDEPENDS = " \
libempserver \
ocaml \
"

RDEPENDS:append:x86-64-v2 = " \
edk2 ipxe \
"
RDEPENDS:append:x86-64 = " \
edk2 ipxe \
"

EXTRA_UPSTREAM_RDEPENDS = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/figlet-2.2.5-38.el10_1.alma_altarch.x86_64_v2.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:aarch64 = " \
${EPEL_MIRROR}/10.1/Everything/x86_64/Packages/f/figlet-2.2.5-38.el10_1.aarch64.rpm \
"
