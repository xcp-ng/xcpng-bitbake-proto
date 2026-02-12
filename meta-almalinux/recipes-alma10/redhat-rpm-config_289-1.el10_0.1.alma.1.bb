
inherit dnf-bridge

PN = "redhat-rpm-config"
PE = "0"
PV = "289"
PR = "1.el10_0.1.alma.1"
PACKAGES = "redhat-rpm-config"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/redhat-rpm-config-289-1.el10_0.1.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_redhat-rpm-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redhat-rpm-config-289-1.el10_0.1.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_redhat-rpm-config}"
RDEPENDS:redhat-rpm-config = " \
 package-notes-srpm-macros \
 dwz \
 fonts-srpm-macros \
 forge-srpm-macros \
 efi-srpm-macros \
 lua-srpm-macros \
 perl-srpm-macros \
 ocaml-srpm-macros \
 qt6-srpm-macros \
 sed \
 gcc-plugin-annobin \
 openblas-srpm-macros \
 zip \
 rust-toolset-srpm-macros \
 grep \
 pyproject-srpm-macros \
 kernel-srpm-macros \
 python-srpm-macros \
 bash \
 file \
 findutils \
 annobin-plugin-gcc \
 gawk \
 go-srpm-macros \
 llvm \
 coreutils \
 rpm \
"
