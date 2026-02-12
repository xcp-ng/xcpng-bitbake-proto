
inherit dnf-bridge

PN = "pybind11"
PE = "0"
PV = "2.11.1"
PR = "7.el10"
PACKAGES = "pybind11-devel python3-pybind11"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/pybind11-2.11.1-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pybind11-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pybind11-devel-2.11.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pybind11-devel}"
RDEPENDS:pybind11-devel = " \
 python3 \
 cmake-filesystem \
 pkgconf-pkg-config \
 cmake \
"

URI_python3-pybind11 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pybind11-2.11.1-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-pybind11}"
RDEPENDS:python3-pybind11 = " \
 python3 \
 pybind11-devel \
"
