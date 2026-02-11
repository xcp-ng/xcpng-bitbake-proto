
PN = "ocaml-libvirt"
PE = "0"
PV = "0.6.1.7"
PR = "13.el10"
PACKAGES = "ocaml-libvirt ocaml-libvirt-devel"


URI_ocaml-libvirt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libvirt-0.6.1.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libvirt = " \
 glibc \
 ocaml-runtime \
 libvirt-libs \
"

URI_ocaml-libvirt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocaml-libvirt-devel-0.6.1.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ocaml-libvirt-devel = " \
 ocaml-runtime \
 ocaml \
 ocaml-libvirt \
"
