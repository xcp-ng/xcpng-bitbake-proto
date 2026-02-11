
inherit dnf-bridge

PN = "python-sphinx_rtd_theme"
PE = "0"
PV = "2.0.0"
PR = "5.el10"
PACKAGES = "python-sphinx_rtd_theme-doc python3-sphinx_rtd_theme"


URI_python-sphinx_rtd_theme-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-sphinx_rtd_theme-doc-2.0.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python-sphinx_rtd_theme-doc = " \
 lato-fonts \
 fontawesome4-fonts \
 google-roboto-slab-fonts \
"

URI_python3-sphinx_rtd_theme = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinx_rtd_theme-2.0.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-sphinx_rtd_theme = " \
 python3 \
 python3-sphinx \
 lato-fonts \
 python3-sphinxcontrib-jquery \
 google-roboto-slab-fonts \
 fontawesome4-fonts \
 python3-docutils \
"
