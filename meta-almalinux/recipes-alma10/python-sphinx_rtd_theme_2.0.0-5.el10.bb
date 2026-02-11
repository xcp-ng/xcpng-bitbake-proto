
PN = "python-sphinx_rtd_theme"
PE = "0"
PV = "2.0.0"
PR = "5.el10"
PACKAGES = "python-sphinx_rtd_theme-doc python3-sphinx_rtd_theme"


URI_python-sphinx_rtd_theme-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-sphinx_rtd_theme-doc-2.0.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python-sphinx_rtd_theme-doc = "font(fontawesome) ( ) font(lato) ( ) font(robotoslab) ( )"
RPROVIDES:python-sphinx_rtd_theme-doc = "python-sphinx_rtd_theme-doc ( =  2.0.0-5.el10)"

URI_python3-sphinx_rtd_theme = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinx_rtd_theme-2.0.0-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-sphinx_rtd_theme = "font(fontawesome) ( ) font(lato) ( ) font(robotoslab) ( ) python(abi) ( =  3.12) python3.12dist(docutils) ( <  0.21~~) python3.12dist(sphinx) ( with  (REL)) python3.12dist(sphinxcontrib-jquery) ( with  (REL))"
RPROVIDES:python3-sphinx_rtd_theme = "python-sphinx_rtd_theme ( =  2.0.0-5.el10) python3-sphinx_rtd_theme ( =  2.0.0-5.el10) python3.12-sphinx_rtd_theme ( =  2.0.0-5.el10) python3.12dist(sphinx-rtd-theme) ( =  2) python3dist(sphinx-rtd-theme) ( =  2)"
